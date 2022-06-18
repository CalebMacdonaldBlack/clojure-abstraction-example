(ns v2.database.company.core)

(defn database-type
  [database & _]
  (type database))

(defmulti create! database-type)

(defmulti fetch-one database-type)
