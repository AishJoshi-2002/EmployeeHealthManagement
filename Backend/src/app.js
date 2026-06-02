const express = require("express");
const cors = require("cors");

const hospitalRoutes = require("./routes/hospitalRoutes");

const app = express();

app.use(cors());
app.use(express.json());

app.use("/api/hospital", hospitalRoutes);

module.exports = app;