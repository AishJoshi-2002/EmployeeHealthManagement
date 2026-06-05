const express = require("express");
const cors = require("cors");

const hospitalRoutes = require("./routes/hospitalRoutes");
const medicalPortalRoutes = require("./routes/medicalPortal");
const healthCheckupRequestRoutes = require("./routes/healthCheckupRequestRoutes");

const app = express();

app.use(cors());
app.use(express.json());

app.use("/api/hospital", hospitalRoutes);
app.use("/api/medical-portal", medicalPortalRoutes);
app.use("/api/health-checkup-request", healthCheckupRequestRoutes);

module.exports = app;