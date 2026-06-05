const express = require("express");
const router = express.Router();
const { addHealthCheckupRequest} = require("../controllers/healthCheckupRequestController");

router.post("/", addHealthCheckupRequest);

module.exports = router;