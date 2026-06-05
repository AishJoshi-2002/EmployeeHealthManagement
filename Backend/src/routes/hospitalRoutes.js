const express = require("express");
const router = express.Router();
const { getHospitals, getHospitalsByCity, addHospital, updateHospital, updateHospitalRates} = require("../controllers/hospitalController");

router.get("/", getHospitals);
router.get("/get-hospitals-by-location", getHospitalsByCity);
router.post("/", addHospital);
router.put("/:id", updateHospital);
router.put("/:id/rates", updateHospitalRates);

module.exports = router;