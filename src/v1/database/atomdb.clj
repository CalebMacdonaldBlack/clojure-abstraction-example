(ns v1.database.atomdb)

(defrecord AtomDB [state])

(defn new-atom-db []
  (->AtomDB (atom {})))
