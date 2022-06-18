(ns v1.database.company.core)

(defprotocol CompanyDatabase
  (create! [this company])
  (fetch-one [this company-id]))
