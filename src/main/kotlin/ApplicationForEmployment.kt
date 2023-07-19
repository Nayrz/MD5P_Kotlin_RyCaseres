fun main(){
    //Header
    var position: String = "Web Developer"
    var salary: Int = 1000
    var dateAvailability: String = "June 30,2024"
    println("                             Application for Employment                            ")
    println("Position You Are Applying For: $position              Desired Salary: $salary   ")
    println("Date Available for Work: $dateAvailability")

    //Personal Information
    var lastName: String = "Caseres"
    var firstName: String = "Ryan"
    var middleName: String ="Amantillo"
    var brgyAddress: String = "Brgy. Zone 2"
    var city: String = "Cadiz City"
    var state: String = "Negros Ooccidental"
    var zipCode: Int = 6121
    var telNumber: Int = 354211795
    var cpNUmber: Int = 190761395
    var email: String = "nayrcaseres@yahoo.com"
    var sssNUmber: Int = 703145632
    var usCitizen: Boolean = false
    var exconvict: Boolean = false
    var drugTest: Boolean = true
    println("PERSONAL INFORMATION")
    println("$lastName                         $firstName                      $middleName")
    println("Last Name                       First Name                Middle Name")
    println("$brgyAddress                    $city                $state         $zipCode")
    println("Address                         City                      State                      Zip")
    println("Home Phone: $telNumber           Cell Phone: $cpNUmber       Email address: $email")
    println("Social Security Number: $sssNUmber")
    println("Are you a U.S. Citizen? $usCitizen")
    println("Have you been convicted of a felony? $exconvict")
    println("If selected for employment are you willing to submit to a pre-employment drug screening test? $drugTest")

    //Education
    var schoolName1: String = "Pantao Elementary School"
    var schoolName2: String = "Manjuyod National High School"
    var schoolName3: String = "Negros Oriental State University"
    var location1: String = "Pantao, Mabinay Negros Oriental"
    var location2: String = "Sundo-an, Manjuyod Negros Oriental"
    var location3: String = "Kagawasan Ave. Dumaguete City"
    var yearsAttended1: String = "1998-2004"
    var yearsAttended2: String = "2004-2008"
    var yearsAttended3: String = "2008-2015"
    var degreeReceived1: String = "N/A"
    var degreeReceived2: String = "N/A"
    var degreeReceived3: String = "N/A"
    var major1: String = "N/A"
    var major2: String = "N/A"
    var major3: String = "N/A"
    var otherTraining: String = "N/A"
    println("EDUCATION")
    println("School Name                      Location                             Years Attended              Degree Received     Major")
    println("$schoolName1         $location1      $yearsAttended1                   $degreeReceived1                 $major1")
    println("$schoolName2    $location2   $yearsAttended2                   $degreeReceived2                 $major2")
    println("$schoolName3 $location3        $yearsAttended3                   $degreeReceived3                 $major3")
    println("Other training, certification or license held: $otherTraining")

    //Employment
    var employer: String = "Qualfon Phils. Inc."
    var dateEmployed: String = "Nov. 11, 2011"
    var workPhone: Int = 354223257
    var payRate1: Double = 1.50
    var payRate2: Double = 3.00
    var workAdddressSt: String = "Dr. V. Locsin St."
    var workAddressCity: String = "Dumaguete City"
    var workAddressState: String = "Negros Oriental"
    var workZip: Int = 6200
    var workPosition: String = "CSR"
    var dutiesPerformed: String = "Answer calls and helped clients resolve their phone issues"
    var supNameTitle: String = "Ma. Therese Simpao, Floor Supervisor"
    var reasonLeaving: String = "Conflict work and school schedule"
    var contactThem: Boolean = true
    println("EMPLOYMENT")
    println("Employer: $employer     Date Employed: $dateEmployed")
    println("Work Phone: $workPhone             Pay Rate: $$payRate1    to   $$payRate2")
    println("Address: $workAdddressSt")
    println("City: $workAddressCity              State: $workAddressState   Zip: $workZip")
    println("Position: $workPosition")
    println("Duties Performed: $dutiesPerformed")
    println("Supervisors and Title: $supNameTitle")
    println("Reason for leaving: $reasonLeaving")
    println("May we contact them? $contactThem")

    //References
    var rName1: String = "Ricky L. Canupin"
    var rName2: String = "Jean B. Duran"
    var rName3: String = "Ralph D. Leong"
    var rTitle1: String = "Branch Manager"
    var rTitle2: String = "Superia"
    var rTitle3: String = "Branch Manager"
    var rCompany1: String = "Negros RUSI"
    var rCompany2: String = "Duplamilco Lending, Inc."
    var rCompany3: String = "Duplamilco Lending, Inc."
    var rPhone1: Int = 344201370
    var rPhone2: Int = 354211795
    var rPhone3: Int = 354223257
    println("REFERENCES")
    println("Name                Title                Company                   Phone")
    println("$rName1    $rTitle1       $rCompany1               $rPhone1")
    println("$rName2       $rTitle2              $rCompany2  $rPhone2")
    println("$rName3      $rTitle3       $rCompany3  $rPhone3")

    //Acknowledgement and Authorization
    var certify: Boolean = true
    var authorize: Boolean = true
    var result: Boolean = true
    var dateSigned: String = "July 19, 2023"
    println("Acknowledgement and Authorization")
    println("| $certify | I certify that all answers given herein are true and complete to the best of my knowledge.")
    println("| $authorize | I authorize investigation of all statements contained in this application for employment as may be necessary in arriving an employment decision.")
    println("| $result | In the event of employment, I understand that false or misleading information given in my application or interview/s may result in discharge.")
    println("")
    println("R. Caseres")
    println("Signature of Applicant                    Date: $dateSigned")
}