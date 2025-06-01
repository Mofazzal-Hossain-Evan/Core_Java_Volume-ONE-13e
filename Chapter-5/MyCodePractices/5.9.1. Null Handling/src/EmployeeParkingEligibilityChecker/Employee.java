package EmployeeParkingEligibilityChecker;

sealed interface Employee permits Executive, Manager, Worker {}
