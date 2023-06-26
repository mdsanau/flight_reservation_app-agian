<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
  <h2>Flight Details</h2>
  Flight Number:${flight.flightNumber}</br>
  Operating Airlines:${flight.operatingAirlines}</br>
  DepartureCity:${flight.departureCity}</br>
  ArrivalCity:${flight.arrivalCity }</br>
  Departure Date:${flight.dateOfDeparture }</br>
  
  <h2>Enter Passenger Details</h2>
  <form action="confirmReservation" method = "post">
  <pre>
   first Name<input type = "text" name ="firstName"/>
  last Name<input type = "text" name ="lastName"/>
  middle Name<input type = "text" name ="middleName"/>
  phone Number<input type = "text" name ="phone"/>
  email Id<input type = "text" name = "email">
  <input type="hidden" name = "flightId" value="${flight.id }"/>
  
  <h2>Enter the payment details<h2>
	Name of The CardHolder<input type = "text" name = "nameOfTheCardHolder"/>
	Card Number<input type = "text" name = "cardNumber"/>
	Cvv<input type = "text" name ="cvv"/>
	Expiry Date<input type = "text" name = "expiryDate"/>
  <input type = "submit" value ="complete Reservation"/>
  
  </pre>
 
  
  </form>
</body>
</html>