const { sql } = require("../config/db");

const getHospitals = async (req, res) => {
    try {
        const result = await sql.query(`SELECT * FROM HOSPITAL_MASTER`);
        res.status(200).json(result.recordset);
    } catch (error) {
        console.error(error);
        res.status(500).json({message: "Internal Server Error"});
    }
};

const addHospital = async (req, res) => {
    try {
        const { hospitalId, name, address1, address2, stateId, cityId, pincode, contactNoLL, contactPerson, contactPersonDesignation, contactPersonEmail, contactNoM, altContactPerson, altContactPersonDesignation } = req.body;
        const result = await sql.query(`INSERT INTO HOSPITAL_MASTER (HOSPITAL_ID, NAME, ADDRESS1, ADDRESS2, STATE, CITY_ID, PINCODE, CONTACT_NO_LL, CONTACT_PERSON, CONTACT_PERSON_DESIG, CONTACT_PERSON_EMAIL, CONTACT_NO_M, ALT_CONTACT_PERSON, ALT_CONTACT_PERSON_DESIG) VALUES ('${hospitalId}', '${name}', '${address1}', '${address2}', '${stateId}', '${cityId}', '${pincode}', '${contactNoLL}', '${contactPerson}', '${contactPersonDesignation}', '${contactPersonEmail}', '${contactNoM}', '${altContactPerson}', '${altContactPersonDesignation}')`);
        res.status(200).json({message: "Hospital added successfully"});
    } catch (error) {
        console.error(error);
        res.status(500).json({message: "Internal Server Error"});
    }
};

const updateHospital = async (req, res) => {
    try {
        const result = await sql.query(`SELECT * FROM HOSPITAL_MASTER`);
        res.status(200).json(result.recordset);
    } catch (error) {
        console.error(error);
        res.status(500).json({message: "Internal Server Error"});
    }
};

const updateHospitalRates = async (req, res) => {
    try {
        const result = await sql.query(`SELECT * FROM HOSPITAL_MASTER`);
        res.status(200).json(result.recordset);
    } catch (error) {
        console.error(error);
        res.status(500).json({message: "Internal Server Error"});
    }
};

module.exports = { getHospitals, addHospital, updateHospital, updateHospitalRates };




