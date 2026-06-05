const { sql } = require("../config/db");

const addHealthCheckupRequest = async (req, res) => {
    const transaction = new sql.Transaction();
    try {
        await transaction.begin();
        const request = new sql.Request(transaction);
        const { hospitalId, name, address1, address2, stateId, cityId, pincode, contactNoLL, contactPerson, contactPersonDesignation, contactPersonEmail, contactNoM, altContactPerson, altContactPersonDesignation, altContactPersonEmail, altContactPersonNoM, rateMale, rateFemale, validUpto, concessionInfo, remarks } = req.body;

        // hospital_master
        await request.query(`INSERT INTO HOSPITAL_MASTER (HOSPITAL_ID, NAME, ADDRESS1, ADDRESS2, STATE, CITY_ID, PINCODE, CONTACT_NO_LL, CONTACT_PERSON, CONTACT_PERSON_DESIG, CONTACT_PERSON_EMAIL, CONTACT_NO_M, ALT_CONTACT_PERSON, ALT_CONTACT_PERSON_DESIG, ALT_CONTACT_PERSON_EMAIL, ALT_CONTACT_PERSON_NO_M) VALUES ('${hospitalId}', '${name}', '${address1}', '${address2}', '${stateId}', '${cityId}', '${pincode}', '${contactNoLL}', '${contactPerson}', '${contactPersonDesignation}', '${contactPersonEmail}', '${contactNoM}', '${altContactPerson}', '${altContactPersonDesignation}', '${altContactPersonEmail}', '${altContactPersonNoM}')`);

        // hospital_currency
        await request.query(`INSERT INTO HOSPITAL_CURRENCY (HOSPITAL_ID, RATE_MALE, RATE_FEMALE, VALID_UPTO, CONCESSION_INFO, REMARKS) VALUES ( '${hospitalId}', '${rateMale}', '${rateFemale}', '${validUpto}', '${concessionInfo}', '${remarks}')`);

        await transaction.commit();
        res.status(200).json({
            message: "Hospital added successfully"
        });
    } catch (error) {
        await transaction.rollback();
        console.error(error);
        res.status(500).json({
            message: "Internal Server Error"
        });
    }
};

module.exports = { addHealthCheckupRequest };
