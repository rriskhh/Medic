package rriskhh.start.medic;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by rriskhh on 06/06/16.
 */
public class DataSource {
    static SQLiteDatabase db;
    public DataSource(SQLiteDatabase db){
        this.db = db;
    }
    public DataSource(){

    }
    public void setSymptom(){
        db.execSQL("CREATE TABLE IF NOT EXISTS `symptoms` (" +
                        "`part` varchar(255) NOT NULL," +
                        "`symptom` varchar(255) NOT NULL" +
                ");");
        db.execSQL("delete from symptoms;");
        db.execSQL("INSERT INTO `symptoms` (`part`, `symptom`) VALUES\n" +
                "('Scalp', 'Agitation'),\n" +
                "('Scalp', 'Anxiety'),\n" +
                "('Scalp', 'Apathy'),\n" +
                "('Scalp', 'Blackouts (memory time loss)'),\n" +
                "('Scalp', 'Bleeding'),\n" +
                "('Scalp', 'Brittle Hair'),\n" +
                "('Nose', 'Bruising or discoloration'),\n" +
                "('Nose', 'Bruising or discoloration'),\n" +
                "('Nose', 'Drainage or pus'),\n" +
                "('Nose', 'Difficulty breathing'),\n" +
                "('Nose', 'Frequent infections'),\n" +
                "('Nose', 'Lump or bulge'),\n" +
                "('Eye', 'Blank stare'),\n" +
                "('Eye', 'Bleeding'),\n" +
                "('Face', 'Abnormally round face'),\n" +
                "('Face', 'Blank stare'),\n" +
                "('Mouth', 'Bad breath'),\n" +
                "('Mouth', 'Bad taste in mouth'),\n" +
                "('Ear', 'Bleeding'),\n" +
                "('Ear', 'Bruising or discoloration'),\n" +
                "('Jaw', 'Bleeding'),\n" +
                "('Jaw', 'Broken bone (single fracture)'),\n" +
                "('Neck', 'Bleeding'),\n" +
                "('Neck', 'Bruising or discoloration'),\n" +
                "('Chest', 'Bleeding'),\n" +
                "('Chest', 'Bleeding from nipple'),\n" +
                "('Shoulder', 'Bleeding'),\n" +
                "('Shoulder', 'Bruising or discoloration'),\n" +
                "('Upper Arm (Bicep)', 'Bleeding'),\n" +
                "('Upper Arm (Bicep)', 'Broken bone (single fracture)'),\n" +
                "('Elbow', 'Bleeding'),\n" +
                "('Elbow', 'Broken bone (single fracture)'),\n" +
                "('Forearm (flexor)', 'Bleeding'),\n" +
                "('Forearm (flexor)', 'Broken bone (single fracture)'),\n" +
                "('Wrist', 'Bleeding'),\n" +
                "('Wrist', 'Broken bone (single fracture)'),\n" +
                "('Palm', 'Bleeding'),\n" +
                "('Palm', 'Blue colored skin'),\n" +
                "('Fingers', 'Black colored skin'),\n" +
                "('Fingers', 'Bleeding'),\n" +
                "('Abdomen', 'Bleeding'),\n" +
                "('Abdomen', 'Bloating or fullness'),\n" +
                "('Thigh', 'Bleeding'),\n" +
                "('Thigh', 'Broken bone (single fracture)'),\n" +
                "('Knee', 'Bleeding'),\n" +
                "('Knee', 'Bruising or discoloration'),\n" +
                "('Shin', 'Bleeding'),\n" +
                "('Shin', 'Broken bone (single fracture)'),\n" +
                "('Ankle', 'Bleeding'),\n" +
                "('Ankle', 'Broken bone (single fracture)'),\n" +
                "('Foot', 'Bleeding'),\n" +
                "('Foot', 'Blue colored skin'),\n" +
                "('Toes', 'Black colored skin'),\n" +
                "('Toes', 'Bleeding'),\n" +
                "('Scalp', 'Bald spots (hair)'),\n" +
                "('Scalp', 'Broken bone (single fracture)'),\n" +
                "('Scalp', 'Broken bones (multiple fractures)'),\n" +
                "('Scalp', 'Bruising or discoloration'),\n" +
                "('Scalp', 'Coma'),\n" +
                "('Scalp', 'Compulsive behavior'),\n" +
                "('Scalp', 'Confusion'),\n" +
                "('Scalp', 'Craving alcohol'),\n" +
                "('Scalp', 'Craving to eat ice, dirt or paper'),\n" +
                "('Scalp', 'Crawling sensation'),\n" +
                "('Scalp', 'Delusions'),\n" +
                "('Scalp', 'Depressed mood'),\n" +
                "('Scalp', 'Difficult to wake from sleep'),\n" +
                "('Scalp', 'Difficulty concentrating'),\n" +
                "('Scalp', 'Difficulty falling asleep'),\n" +
                "('Scalp', 'Difficulty finding words'),\n" +
                "('Scalp', 'Difficulty learning new things'),\n" +
                "('Scalp', 'Difficulty sleeping'),\n" +
                "('Scalp', 'Difficulty solving problems'),\n" +
                "('Scalp', 'Difficulty staying asleep'),\n" +
                "('Scalp', 'Difficulty staying awake during day'),\n" +
                "('Scalp', 'Disorientation'),\n" +
                "('Scalp', 'Dizziness'),\n" +
                "('Scalp', 'Drainage or pus'),\n" +
                "('Scalp', 'Drowsiness'),\n" +
                "('Scalp', 'Early morning waking'),\n" +
                "('Scalp', 'Easily distracted'),\n" +
                "('Scalp', 'Emotional detachment'),\n" +
                "('Scalp', 'Fainting'),\n" +
                "('Scalp', 'Fatigue'),\n" +
                "('Scalp', 'Fear of air'),\n" +
                "('Scalp', 'Fear of gaining weight'),\n" +
                "('Scalp', 'Fear of water'),\n" +
                "('Scalp', 'Feeling of being detached from reality'),\n" +
                "('Scalp', 'Feeling smothered'),\n" +
                "('Scalp', 'Feeling something moving on scalp'),\n" +
                "('Scalp', 'Fever'),\n" +
                "('Scalp', 'Fits of rage'),\n" +
                "('Scalp', 'Flashbacks'),\n" +
                "('Scalp', 'Food cravings'),\n" +
                "('Scalp', 'Forgetfulness'),\n" +
                "('Scalp', 'Frightening dreams'),\n" +
                "('Scalp', 'Frightening thoughts'),\n" +
                "('Scalp', 'Hair loss'),\n" +
                "('Scalp', 'Hallucinations'),\n" +
                "('Scalp', 'Headache'),\n" +
                "('Scalp', 'Headache (worst ever)'),\n" +
                "('Scalp', 'Hearing voices'),\n" +
                "('Scalp', 'Impaired color vision'),\n" +
                "('Scalp', 'Impaired judgement'),\n" +
                "('Scalp', 'Impaired social skills'),\n" +
                "('Scalp', 'Impulsive behavior'),\n" +
                "('Scalp', 'Inappropriate behavior'),\n" +
                "('Scalp', 'Itching or burning'),\n" +
                "('Scalp', 'Lack of emotion'),\n" +
                "('Scalp', 'Lack of motivation'),\n" +
                "('Scalp', 'Lack of pleasure'),\n" +
                "('Scalp', 'Lightheadedness'),\n" +
                "('Scalp', 'Loss of consciousness'),\n" +
                "('Scalp', 'Lump or bulge'),\n" +
                "('Scalp', 'Memory problems'),\n" +
                "('Scalp', 'Mood swings'),\n" +
                "('Scalp', 'Multiple bruises of different ages'),\n" +
                "('Scalp', 'Numbness or tingling'),\n" +
                "('Scalp', 'Paranoid behavior'),\n" +
                "('Scalp', 'Personality changes'),\n" +
                "('Scalp', 'Poor concentration'),\n" +
                "('Scalp', 'Pulling out hair'),\n" +
                "('Scalp', 'Punching or kicking in sleep'),\n" +
                "('Scalp', 'Repeats phrases'),\n" +
                "('Scalp', 'Repetitive behaviors'),\n" +
                "('Scalp', 'Restless (tossing and turning) sleep'),\n" +
                "('Scalp', 'Sadness'),\n" +
                "('Scalp', 'Scratching'),\n" +
                "('Scalp', 'Seizures (uncontrollable jerking of limbs)'),\n" +
                "('Scalp', 'Sense of impending doom'),\n" +
                "('Scalp', 'Skin irritation'),\n" +
                "('Scalp', 'Sleep walking'),\n" +
                "('Scalp', 'Slow thinking'),\n" +
                "('Scalp', 'Spinning sensation'),\n" +
                "('Scalp', 'Swelling'),\n" +
                "('Scalp', 'Tenderness to touch'),\n" +
                "('Scalp', 'Unusual behavior'),\n" +
                "('Scalp', 'Visible bugs or parasites'),\n" +
                "('Scalp', 'Visible deformity'),\n" +
                "('Scalp', 'Warm to touch'),\n" +
                "('Scalp', 'White specks on scalp or hair');\n");

            db.execSQL("CREATE TABLE IF NOT EXISTS `diseases` (" +
                    "  `symptom` varchar(255) NOT NULL," +
                    "  `disease` varchar(255) NOT NULL" +
                    "); ");
        db.execSQL("delete from diseases;");
        db.execSQL("INSERT INTO `diseases` (`symptom`, `disease`) VALUES\n" +
                "('Agitation', 'Hypocalcemia'),\n" +
                "('Headache', 'Hypocalcemia'),\n" +
                "('Muscle cramps or spasms (painful', 'Hypocalcemia'),\n" +
                "('Muscle weakness', 'Hypocalcemia'),\n" +
                "('Muscle twitching (painless)', 'Hypocalcemia'),\n" +
                "('Difficulty relaxing muscles after contracting them', 'Hypocalcemia'),\n" +
                "('Apathy', 'Depression'),\n" +
                "('Anxiety', 'Depression'),\n" +
                "('Constipation', 'Depression'),\n" +
                "('Decreased appetite', 'Depression'),\n" +
                "('Depressed mood', 'Depression'),\n" +
                "('Difficulty sleeping', 'Depression'),\n" +
                "('Fatigue', 'Depression'),\n" +
                "('Memory problems', 'Depression'),\n" +
                "('Bald spots (hair)', 'Alopecia'),\n" +
                "('Itching or burning', 'Alopecia'),\n" +
                "('Skin rash', 'Alopecia'),\n" +
                "('Hair loss', 'Alopecia'),\n" +
                "('Brittle hair', 'Alopecia'),\n" +
                "('Bleeding', 'Trauma or Injury'),\n" +
                "('Stiffness or decreased movement', 'Trauma or Injury'),\n" +
                "('Bruising or discoloration', 'Trauma or Injury'),\n" +
                "('Lump or bulge', 'Trauma or Injury'),\n" +
                "('Bleeding in eye', 'Trauma or Injury'),\n" +
                "('Nosebleed', 'Trauma or Injury'),\n" +
                "('Broken bones (multiple fractures)', 'Trauma or Injury'),\n" +
                "('Broken bone (single fracture)', 'Trauma or Injury'),\n" +
                "('Blackouts (memory time loss)', 'Medication Reaction or Side Effect'),\n" +
                "('Agitation', 'Medication Reaction or Side Effect'),\n" +
                "('Stiffness or decreased movement', 'Medication Reaction or Side Effect'),\n" +
                "('Bleeding gums', 'Medication Reaction or Side Effect'),\n" +
                "('Blood or red colored urine', 'Medication Reaction or Side Effect'),\n" +
                "('Bloody or red colored stools', 'Medication Reaction or Side Effect'),\n" +
                "('Black (tar) colored stools', 'Medication Reaction or Side Effect'),\n" +
                "('Blurred vision', 'Medication Reaction or Side Effect'),\n" +
                "('Tenderness to touch', 'Bruise or Contusion'),\n" +
                "('Bruising or discoloration', 'Bruise or Contusion'),\n" +
                "('Bruising or discoloration', 'Hematoma'),\n" +
                "('Tenderness to touch', 'Hematoma'),\n" +
                "('Bleeding gums', 'Thrombocytopenia'),\n" +
                "('Bruising or discoloration', 'Thrombocytopenia'),\n" +
                "('Blood or red colored urine', 'Thrombocytopenia'),\n" +
                "('Bloody or red colored stools', 'Thrombocytopenia'),\n" +
                "('Black (tar) colored stools', 'Thrombocytopenia'),\n" +
                "('Easy bleeding', 'Thrombocytopenia'),\n" +
                "('Easy bruising', 'Thrombocytopenia'),\n" +
                "('Nosebleed', 'Thrombocytopenia'),\n" +
                "('Prolonged bleeding', 'Thrombocytopenia'),\n" +
                "('Drainage or pus', 'Acute Sinusitis'),\n" +
                "('Swelling', 'Acute Sinusitis'),\n" +
                "('Difficulty breathing', 'Dust Exposure'),\n" +
                "('Watery eyes', 'Dust Exposure'),\n" +
                "('Bald spots (hair)', 'Alopecia'),\n" +
                "('White specks on scalp or hair', 'Lice'),\n" +
                "('Itching or burning', 'Lice'),\n" +
                "('Skin irritation', 'Lice'),\n" +
                "('Hair loss', 'Lice'),\n" +
                "('Bald spots (hair)', 'Lice'),\n" +
                "('Visible bugs or parasites', 'Licd'),\n" +
                "('Scratching', 'Lice'),\n" +
                "('Crawling sensation', 'Lice'),\n" +
                "('Feeling something moving on scalp', 'Lice'),\n" +
                "('White specks on scalp or hair', 'Seborrheic Dermatitis'),\n" +
                "('Itching or burning', 'Seborrheic Dermatitis'),\n" +
                "('Skin rash', 'Seborrheic Dermatitis'),\n" +
                "('Warm to touch', 'Abscess'),\n" +
                "('Pain or discomfort', 'Abscess'),\n" +
                "('Chills', 'Abscess'),\n" +
                "('Enlarged or swollen glands', 'Abscess'),\n" +
                "('Fever', 'Abscess'),\n" +
                "('Lump or bulge', 'Abscess'),\n" +
                "('Skin open sore', 'Abscess'),\n" +
                "('Skin redness', 'Abscess'),\n" +
                "('Tenderness to touch', 'Abscess'),\n" +
                "('Tenderness to touch', 'Abscess'),\n" +
                "('Drainage or pus', 'Abscess'),\n" +
                "('Coma', 'Brain Injury'),\n" +
                "('Loss of consciousness', 'Brain Injury'),\n" +
                "('Unequal pupils (size)', 'Brain Injury'),\n" +
                "('Coma', 'Carbon Monoxide Poisoning'),\n" +
                "('Dizziness', 'Carbon Monoxide Poisoning'),\n" +
                "('Fatigue', 'Carbon Monoxide Poisoning'),\n" +
                "('Headache', 'Carbon Monoxide Poisoning'),\n" +
                "('Memory problems', 'Carbon Monoxide Poisoning'),\n" +
                "('Nausea or vomiting', 'Carbon Monoxide Poisoning'),\n" +
                "('Loss of consciousness', 'Carbon Monoxide Poisoning'),\n" +
                "('Unable to blink or close eyelid', 'Carbon Monoxide Poisoning'),\n" +
                "('Coma', 'Diabetic Ketoacidosis'),\n" +
                "('Difficult to wake from sleep', 'Diabetic Ketoacidosis'),\n" +
                "('Confusion', 'Diabetic Ketoacidosis'),\n" +
                "('Blurred vision', 'Diabetic Ketoacidosis'),\n" +
                "('Disorientation', 'Diabetic Ketoacidosis'),\n" +
                "('Drowsiness', 'Diabetic Ketoacidosis');");
    }
    public Cursor getParts(){
        Cursor c1 = db.rawQuery("Select DISTINCT part from symptoms",null);
        return c1;
    }
    public Cursor getSymptom(String part){
        Cursor c1 = db.rawQuery("Select * from symptoms where part='" + part + "'",null);
        return c1;
    }
    public String getDisease(String symptom){
        String tm = "";
        Cursor c1 = db.rawQuery("Select * from diseases where symptom = '" + symptom + "';",null);
        if(c1.moveToFirst()){
            do{
                tm += c1.getString(c1.getColumnIndex("disease")) + ",";
            }while(c1.moveToNext());
        }
        return tm;
    }
    /*
    *   Drug Alternative;
     */
    public void setDrug(){
        db.execSQL("CREATE TABLE IF NOT EXISTS `drug` (" +
                "  `name` varchar(255) NOT NULL," +
                "  `company` varchar(255) NOT NULL," +
                "  `composition` varchar(255) NOT NULL," +
                "  `price` int(255) NOT NULL" +
                ");");
        db.execSQL("delete from drug;");
        db.execSQL("INSERT INTO `drug` (`name`, `company`, `composition`, `price`) VALUES\n" +
                "('Combiflam (400 & 325)', 'Sanofi Aventis', 'Ibuprofen: 400 mg + Paracetamol: 325 mg', 6),\n" +
                "('Ibudex (400 & 325)', 'Therawin Formulations', 'Ibuprofen: 400 mg + Paracetamol: 325 mg', 2),\n" +
                "('Alerid Cold (500 & 25 & 5)', 'Aronex Life Sciences Pvt. Ltd.', 'Paracetamol: 500 mg + Cetirizine: 5 mg + Phenylpropanolamine: 25 mg ', 29),\n" +
                "('Sinocet (500 & 25 & 5)\\r\\n', 'Pharmatech Healthcare', 'Paracetamol: 500 mg + Cetirizine: 5 mg + Phenylpropanolamine: 25 mg ', 14),\n" +
                "('Dold Cold', 'B & B (Micro Labs Ltd.)', 'Paracetamol: 500 mg + Chlorpheniramine Maleate: 2 mg + Pseudoephedrine: 30 mg + Phenylpropanolamine: 2 mg + Caffeine: 30 mg ', 18),\n" +
                "('Plavix (75 mg)', 'Sanofi Aventis', 'Clopidogrel: 75 mg', 1616),\n" +
                "('Caplor (75 mg)', 'Ind-Swift Limited', 'Clopidogrel: 75 mg', 12),\n" +
                "('Tavanic (500 mg)', 'Sanofi Aventis', 'Levofloxacin: 500 mg ', 487),\n" +
                "('Luvo (500 mg)', 'Reco Drugs', 'Levofloxacin: 500 mg ', 30),\n" +
                "('Atorva (20 mg)', 'CND (Zydus Cadila Healthcare Ltd)', 'Atorvastatin: 20 mg ', 199),\n" +
                "('Genxvast (20 mg)', 'Genx (Hetero Healthcare Ltd)', 'Atorvastatin: 20 mg ', 19),\n" +
                "('Violip (20 mg)', 'Pulse Parmaceuticals Pvt.Ltd.', 'Atorvastatin: 20 mg ', 41),\n" +
                "('Marsep Plus (50 & 10)', 'Marsha Pharma Pvt. Ltd.', 'Diclofenac Potassium: 50 mg + Serratiopeptidase: 10 mg', 66),\n" +
                "('Diflac SP (50 & 10)', 'Radicura Pharmaceutical Pvt. Ltd.', 'Diclofenac Potassium: 50 mg + Serratiopeptidase: 10 mg', 5),\n" +
                "('Voveran (50 mg)', 'Novartis Pharmaceuticals Ltd.', 'Diclofenac: 50 mg ', 48),\n" +
                "('Voveran DT (50 mg)', 'Biochemie (Novartis India Limited)', 'Diclofenac: 50 mg ', 44),\n" +
                "('Augmentin (1000 & 200)', 'Glaxo Smithkline Pharmaceuticals Ltd.', 'Amoxycillin: 1000 mg + Clavulanic Acid: 200 mg ', 212),\n" +
                "('Oxylav (1000 & 200)', 'Eclipser Pharmaceuticals', 'Amoxycillin: 1000 mg + Clavulanic Acid: 200 mg ', 180),\n" +
                "('Aspirin (300 mg)', 'Bini Laboratories Pvt Ltd', 'Acetyl Salicylic Acid: 300 mg', 2),\n" +
                "('Acetyl Salicylic Acid (300 mg)', 'Unicure (India) Pvt.Ltd.', 'Acetyl Salicylic Acid: 300 mg', 1),\n" +
                "('Ibuprofen (200 mg)', 'Acichem Laboratories', 'Ibuprofen: 200 mg ', 3),\n" +
                "('Ibuprofen (200 mg) (Bini Labs)', 'Bini Laboratories Pvt Ltd', 'Ibuprofen: 200 mg', 2),\n" +
                "('Naproxen Sodium (250 mg)', 'Unicure (India) Pvt.Ltd.', 'Naproxen: 250 mg ', 25),\n" +
                "('Naprosyn (250 mg)', 'RPG Life Sciences Ltd', 'Naproxen: 250 mg ', 15),\n" +
                "('Nice Age (30 mg)', 'Synokem Pharmaceuticals Ltd', 'Nicergoline: 30 mg', 350),\n" +
                "('Nicerbium (30 mg)', 'Synapse (Micro Labs Ltd)', 'Nicergoline: 30 mg ', 215);\n");
    }
    public Cursor getDrug(){
        Cursor c1 = db.rawQuery("Select * from drug;",null);
        return c1;
    }
    public String getAlternateDrug(String drug){
        String tm = "";
        Cursor c1 = db.rawQuery("Select * from drug where name='" + drug + "'", null);
        c1.moveToFirst();
        String org_composition = c1.getString(c1.getColumnIndex("composition"));
        String org_company = c1.getString(c1.getColumnIndex("company"));
        int price = c1.getInt(c1.getColumnIndex("price"));
        c1 = db.rawQuery("Select * from drug where composition = '" + org_composition + "' AND company <> '" + org_company + "' AND price < " + price + ";",null);
        if(c1.moveToFirst()){
            tm += "Drug Name : " + c1.getString(c1.getColumnIndex("name")) + "\n"
                    + "Comapny Name : " + c1.getString(c1.getColumnIndex("company")) + "\n"
                    + "Price : Rs." + c1.getInt(c1.getColumnIndex("price")) + "/-";
        }else{
            tm = "No Alternative Drug Found";
        }
        return tm;
    }

    public void setDoctor() {
        db.execSQL("CREATE TABLE IF NOT EXISTS `doctor` (" +
                "  `area` varchar(255) NOT NULL," +
                "  `speciality` varchar(255) NOT NULL," +
                "  `name` text NOT NULL" +
                ");");
        db.execSQL("delete from doctor;");
        db.execSQL("INSERT INTO `doctor` (`area`, `speciality`, `name`) VALUES\n" +
                "('Rohini', 'Dentist', 'Dr. Asheesh Gupta\\r\\n\\r\\nBDS , MDS-Prosthodontics & Implantology , Certificate in implantology , M.B.A\\r\\n\\r\\nDentist , 17 Years Experience '),\n" +
                "('Rohini', 'Dentist', 'Dr. Parul Gupta\\r\\n\\r\\nBDS , MDS-Orthodontic\\r\\n\\r\\nDentist , 16 Years Experience '),\n" +
                "('Rohini', 'Dentist', 'Dr. Anoop Jain\\r\\n\\r\\nBDS , MDS - Prosthodontics & Implantology , Certified Implantologist\\r\\nDentist , 9 Years Experience '),\n" +
                "('Rohini', 'Dentist', 'Dr. Rajat Gupta\\r\\n\\r\\nMBBS , MS - General Surgery , DNB (General Surgery) , DNB (Plastic Surgery)\\r\\nCosmetic/Plastic Surgeon , Hair Transplant Surgeon , Cosmetologist , Oral And MaxilloFacial Surgeon , 8 Years Experience '),\n" +
                "('Dwarka', 'Dentist', 'Dr. Yogesh Rao\\r\\n\\r\\nBDS , MDS - Prosthodontics and Oral Implantology\\r\\nDentist , Dental Surgeon , 10 Years Experience '),\n" +
                "('Dwarka', 'Dentist', 'Dr. Sumanto Bagchi\\r\\n\\r\\nBDS , Diploma in Health Administration\\r\\nDentist , 9 Years Experience '),\n" +
                "('Dwarka', 'Gynecologist/obstetrician', 'Dr. Yashica Gudesar\\r\\n\\r\\nMBBS , DNB (Obstetrics and Gynecology) , DGO , PGDMLS\\r\\nGynecologist , Obstetrician , 19 Years Experience '),\n" +
                "('Dwarka', 'Gynecologist/obstetrician', 'Dr. Shikha Gurnani\\r\\n\\r\\nMBBS , DNB (Obstetrics and Gynecology)\\r\\nGynecologist , 14 Years Experience '),\n" +
                "('Rohini', 'General Physician', 'Dr. Rajeev Gupta, MD , FCCP (USA) , FCCM , MRCP, Critical Care Medicine , 23 Years Experience '),\n" +
                "('Rohini', 'General Physician', 'Dr. Manoj Aggarwal, MBBS , MD - Internal Medicine, General Physician , 11 Years Experience '),\n" +
                "('Rohini', 'Dermatologist ', 'Dr. Jyoti Sharma, MBBS , MD - Dermatology\\r\\nDermatologist , 12 Years Experience '),\n" +
                "('Rohini', 'Dermatologist ', 'Dr. Divya Aggarwal, MBBS , MD - Dermatology,Dermatologist , Pediatric Dermatologist , Cosmetologist , Immunodermatologist , Dermatosurgeon , Aesthetic Dermatology , 12 Years Experience '),\n" +
                "('Rohini', 'Ayurveda', 'Dr. S K Singh, BAMS , MS - Ayurveda, Ayurvedic Doctor,27 Years Experience '),\n" +
                "('Rohini', 'Ayurveda', 'Dr. Shekhar Tanwar, BAMS, Ayurvedic Doctor, 10 Years Experience '),\n" +
                "('Dwarka', 'General Physician', 'Dr. Aman Vij, MBBS , MD ( Internal Medicine ),General Physician , 18 Years Experience '),\n" +
                "('Dwarka', 'General Physician', 'Dr. Amitabh Khanna,MBBS , DP Card , FCCP (USA) , PG Diabetology (Boston) , Fellowship in Diabetes & Metabolism-Aarhus University,Denmark,Diabetologist , Cardiologist , General Physician , 27 Years Experience '),\n" +
                "('Dwarka', 'Dermatologist', 'Dr. Tapesh Sharma, MBBS , Diploma in Dermatology, Venereology and Leprosy\\r\\nDermatologist , 17 Years Experience '),\n" +
                "('Dwarka', 'Dermatologist', 'Dr. Richa Sharma, MBBS , MD - Dermatology\\r\\nDermatologist , Aesthetic Dermatology , Cosmetologist , 15 Years Experience '),\n" +
                "('Dwarka', 'Ayurveda', 'Dr. Sugeeta Mutreja, BAMS , MBA (H.A) , D.N.H.E, Ayurvedic Doctor,16 Years Experience '),\n" +
                "('Dwarka', 'Ayurveda', 'Dr. Priya Shashank,BAMS , MHa , Lactation & IYCF Counsellor , certified childbirth educator, Ayurvedic Doctor,8 Years Experience\\r\\n'),\n" +
                "('Pitampura', 'Dentist ', 'Dr. Rajnish Mallick,BDS , Certified Implantoalogist Chicago University.Dentist , 19 Years Experience '),\n" +
                "('Pitampura', 'Dentist ', 'Dr. Ruchi Gupta,BDS,Dentist , 12 Years Experience '),\n" +
                "('Saket', 'Dentist', 'Dr. Anurag Singh,BDS , MDS - Oral & Maxillofacial Surgery , FELLOW INTERNATIONAL CONGRESS OF ORAL IMPLANTOLOGY, Oral And MaxilloFacial Surgeon , Dentist , 17 Years Experience '),\n" +
                "('Saket', 'Dentist', 'Dr. Manoj Kumar Verma,BDS, (FAGE) Fellow of Academy of General Education, 12 years experience,Dentist,Dr. Manoj''s Dental Clinic ');\n");
    }
    public Cursor getSpec(){
        return db.rawQuery("Select DISTINCT speciality from doctor;",null);
    }
    public Cursor getArea(){
        return db.rawQuery("Select DISTINCT area from doctor;",null);
    }

    public String getAllDoctors(String spec, String area){
        String tm = "No Doctors found";
        Cursor c1 = db.rawQuery("Select * from doctor where speciality = '" + spec + "' AND area = '" + area + "';",null);
        if(c1.moveToFirst()){
            tm  = "";
            do{
                tm += c1.getString(c1.getColumnIndex("name")) + "\n\n";
            }while(c1.moveToNext());
        }

        return tm;
    }

    public void addMedicines(String mname, String tim, String days){

        db.execSQL("CREATE TABLE IF NOT EXISTS `medicine` (" +
                "  `mname` varchar(255) NOT NULL," +
                "  `days` varchar(255) NOT NULL," +
                "  `times` varchar(255) NOT NULL" +
                "); ");
        db.execSQL("insert into `medicine` values('" + mname + "','" + days + "','" + tim + "');");
    }
    public Cursor getMedicines(){
        db.execSQL("CREATE TABLE IF NOT EXISTS `medicine` (" +
                "  `mname` varchar(255) NOT NULL," +
                "  `days` varchar(255) NOT NULL," +
                "  `times` varchar(255) NOT NULL" +
                "); ");
        return db.rawQuery("Select * from medicine",null);
    }
}
