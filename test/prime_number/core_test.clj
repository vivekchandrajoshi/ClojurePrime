(ns prime-number.core-test
		(:require [clojure.test :refer :all]
			[prime-number.core :refer :all]))

(deftest test-primes
				 (testing "prime numbers check"
									(is (not (prime-check? -1)))
									(is (not (prime-check? 0)))
									(is (not (prime-check? 1)))
									(is (prime-check? 2))
									(is (prime-check? 3))
									(is (not (prime-check? 4)))
									(is (prime-check? 5))
									(is (not (prime-check? 6)))
									(is (prime-check? 7))
									(is (prime-check? 115249))))

(deftest test-get-first-n-primes
				 (testing "get the first n primes"
									(is (= [] (get-first-n-primes -1)))
									(is (= [] (get-first-n-primes 0)))
									(is (= [2] (get-first-n-primes 1)))
									(is (= [2 3] (get-first-n-primes 2)))
									(is (= [2 3 5 7 11] (get-first-n-primes 5)))))

(deftest test-multiplication-table
				 (testing "printing the table"
									(is (= (with-out-str (-main "4"))
												 (str "\r\n"
															"| * |  2 |  3 |  5 |  7 |\r\n"
															"|---+----+----+----+----|\r\n"
															"| 2 |  4 |  6 | 10 | 14 |\r\n"
															"| 3 |  6 |  9 | 15 | 21 |\r\n"
															"| 5 | 10 | 15 | 25 | 35 |\r\n"
															"| 7 | 14 | 21 | 35 | 49 |\r\n")))))

