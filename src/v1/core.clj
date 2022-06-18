(ns v1.core
  (:require
    [v1.database.company.core :as company]
    [v1.database.atomdb :as atomdb]))

(def database (atomdb/new-atom-db))

(company/create! database
  {:id "123" :name "Foo Inc"})
