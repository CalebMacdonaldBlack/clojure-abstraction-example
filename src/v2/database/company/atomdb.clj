(ns v2.database.company.atomdb
  (:require
    [v2.database.company.core :as company])
  (:import (v2.database.atomdb AtomDB)))

(defmethod company/create!
  AtomDB
  [{:keys [state]} {:keys [id] :as company}]
  (swap! state assoc id company))

(defmethod company/fetch-one
  AtomDB
  [{:keys [state]} company-id]
  (get @state company-id))
