(ns v1.database.company.postgres
  (:require
    [v1.database.company.core :as company]
    [next.jdbc.sql :as sql])
  (:import (v1.database.postgres PostgresDB)))

(extend-protocol company/CompanyDatabase
  PostgresDB

  (company/create! [{:keys [conn]} company]
    (sql/insert! conn :company company))

  (company/fetch-one [{:keys [conn]} company-id]
    (sql/get-by-id conn :company company-id)))
