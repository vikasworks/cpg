package com.etl.aapi.common.data;

public interface APIConstant {

	public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
	public static final String SECURITY_ERROR = "Invalid Security token";
	public static final int LINK_VALIDATION_TIME = 10;
	public static final String SERVICE_EXCEPTION = "Service Exception";
	public static final String EMAIL_SEND_ERROR = "error in sending email";
	public static final String EMAIL_SENT = "email sent";
	public static final String UNAUNTHENTICATED_USER = "user is not authenticated";
	public static final String AUNTHENTICATED_USER = "user is authenticated";
	public static final String CORRECT_PASSWORD = "password is correct";
	public static final String INCORRECT_PASSWORD = "password can not be null or empty";
	public static final String INCORRECT_HASH_PASSWORD = "Hash_Password can not be null or empty";
	public static final String PASSWORD_MISMATCH = "password did not match";
	public static final String ENCRYPTION_ERROR = "unable to create hash_password";
	public static final String ACTIVE_SUPPLIER_NOT_FOUND = "No active supplier found";
	public static final String NO_FLIGHTCLASS_FOUND = "No flight class found";
	public static final String COLLECTION_NOT_FOUND = "collection name does not exist";
	public static final String PRECONDITION_FAILED = "precondition failed";
	public static final String LOCALE_OR_NAME_NOT_EMPTY = "locale OR name should not be empty";
	public static final String DESTINATION_NOT_FOUND = "destinations not found";
	public static final String STATE_CODE_INCORRECT = "state  code cannot be negative or zero or empty";
	public static final String COUNTRY_CODE_INCORRECT = "country  code cannot be negative or zero or empty";
	public static final String LOCALE_EMPTY = "locale cannot be empty";
	public static final String CITY_NOT_FOUND = "city not found";
	public static final String COUNTRY_NOT_FOUND = "country not found";
	public static final String STATE_NOT_FOUND = "state not found";
	public static final String USER_NOT_FOUND = "User does not exist";
	public static final String INVALID_PASSWORD_EMAIL = " Invalid email or password";
	public static final String BAD_REQUEST = "Bad Request";
	public static final String SERVICE_UNAVAILABLE = "Service Unavailable";
	public static final String UTF_8 = "utf-8";
	public static final String SPL_CHAR = "$";
	public static final String TIME_OR_USER_INVALID = "link time or user not validated";
	public static final String SUCCESS = "Success";
	public static final String DATE_TIME_FORMAT = "dd/MM/yy HH:mm:ss";
	public static final String SUPPLIER_EMPTY = "supplier should not be null";
	public static final String UNIQUE_ID_EMPTY = "uniqueId should not be null";
	public static final String COLLECTION_NAME_TRAVELLERDETAIL = "traveller_details";
	public static final String ID_NOT_AVAILABLE = "availablityId not available";
	public static final String SEARCH_AVAILABILITY_ID_NOT_AVAILABLE = "search id or availability id cannot be null";
	public static final String INVALID_AVAILABILITY_INFO = "availability info is not valid";
	public static final String INVALID_TRIP_INFO = "trip info is not valid";
	public static final String INVALID_SIGN_UP_INFO = "Sign-up Details not valid";
	public static final String FLIGHT_ONEWAY_SEARCH_URL_KEY_VALUE = "flight.oneway";
	public static final String FLIGHT_ROUNDTRIP_SEARCH_URL_KEY_VALUE = "flight.roundtrip";
	public static final String FLIGHT_AVAILABILITY_URL_KEY_VALUE = "flight.availability";
	public static final String FLIGHT_FARERULES_URL_KEY_VALUE = "flight.farerules";
	public static final String FLIGHT_BOOKING_CANCELLATION_URL_KEY_VALUE = "flight.booking.cancellation";
	public static final String FAILURE = "FAILURE";
	public static final String INVALID_TRAVELLER = "Traveller Data is not valid";
	public static final String INVALID_TRAVELLERS = "Traveller list is not valid";
	public static final String NO_AIRLINE_FOUND = "No airline found";
	public static final String FLIGHT_BOOKING_URL_KEY_VALUE = "flight.booking";
	public static final String FLIGHT_SSR_URL_KEY_VALUE = "flight.ssr";
	public static final String FLIGHT = "FLIGHT";
	public static final String TRIP_COLLECTION_NAME = "trips";
	public static final String ERROR = "ERROR";
	public static final String ADMIN_USER = "admin";
	public static final String NA = "NA";
	public static final String EMPTY = "";
}