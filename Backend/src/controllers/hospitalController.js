const { sql } = require("../config/db");

const getHospitals = async (req, res) => {
    try {

        const result = await sql.query(`
            SELECT *
            FROM HOSPITAL_MASTER
        `);

        res.status(200).json(result.recordset);

    } catch (error) {

        console.error(error);

        res.status(500).json({
            message: "Internal Server Error"
        });
    }
};

module.exports = {
    getHospitals
};