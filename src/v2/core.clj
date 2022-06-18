(ns v2.core
  (:require
    [v2.database.company.core :as company]
    [v2.database.atomdb :as atomdb]))

(def database (atomdb/new-atom-db))

(company/create! database
  {:id "123" :name "Foo Inc"})
