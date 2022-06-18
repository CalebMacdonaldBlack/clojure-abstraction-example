(ns v2.database.company.postgres
  (:require
    [v2.database.company.core :as company]
    [next.jdbc.sql :as sql])
  (:import (v2.database.postgres PostgresDB)))

(defmethod company/create!
  PostgresDB
  [{:keys [conn]} company]
  (sql/insert! conn :company company))

(defmethod company/fetch-one
  PostgresDB
  [{:keys [conn]} company-id]
  (sql/get-by-id conn :company company-id))
