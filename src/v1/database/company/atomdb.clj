(ns v1.database.company.atomdb
  (:require
    [v1.database.company.core :as company])
  (:import (v1.database.atomdb AtomDB)))

(extend-protocol company/CompanyDatabase
  AtomDB

  (company/create! [{:keys [state]} {:keys [id] :as company}]
    (swap! state assoc id company))

  (company/fetch-one [{:keys [state]} company-id]
    (get @state company-id)))
