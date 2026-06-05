const express = require("express");

const router = express.Router();

router.get("/employee", async (req, res) => {
    res.status(200).json({
        employeeNo: "10124",
        employeeName: "ANJANI UPADHYAY",
        designation: "Software Engineer",
        division: "INFORMATION TECHNOLOGY",
        employeeMobileNo: "8963425178",
        employeeLandlineNo: "0141-2567890",
        sbuEmployeeNo: "10175",
    });
});

router.get("/dependents", async (req, res) => {
    res.status(200).json([
        {
            id: 1,
            name: "ANJANI UPADHYAY",
            dob: "1975-01-26",
            age: 51,
            eligible: true
        },
        {
            id: 2,
            name: "SWETA SHARMA",
            dob: "1976-08-28",
            age: 49,
            eligible: true
        }
    ]);
});

module.exports = router;