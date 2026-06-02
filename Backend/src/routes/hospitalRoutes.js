const express = require("express");
const router = express.Router();
const { getHospitals, addHospital, updateHospital, updateHospitalRates} = require("../controllers/hospitalController");

router.get("/", getHospitals);
router.post("/", addHospital);
router.put("/:id", updateHospital);
router.put("/:id/rates", updateHospitalRates);

module.exports = router;