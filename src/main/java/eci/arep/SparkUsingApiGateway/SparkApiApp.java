package eci.arep.SparkUsingApiGateway;


/**
 * Hello world!
 *
 */
import static spark.Spark.*;
import POJOWeb.MathServices;;

public class SparkApiApp {
	/**
	 * Main donde se generara el html con el cual el servicio web va a trabajar
	 * 
	 */

	public static void main(String[] args) {
		port(getPort());

		get("/index", (req, res) -> "<!DOCTYPE html>\r\n" + "<html>\r\n" + "   <head>\r\n"
				+ "    <!-- Required meta tags -->\r\n" + "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n"
				+ "\r\n" + "    <!-- Bootstrap CSS -->\r\n"
				+ "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n"
				+ "\r\n" + "    <title>Caculadora</title>\r\n" + "  </head>\r\n"
				+ "  <body style='background-color:#dc3545;'>\r\n" + " <div class=\"container\">\r\n"
				+ "    <div class=\"container\" id=\"title\">\r\n" + "      <h1 class=\"text-center\">\r\n"
				+ "        Calculadora del Cuadrado de un numero\r\n" + "      </h1>\r\n" + "    </div>\r\n"
				+ "	<form action=\"resp\">\r\n" + "    <div class=\"container\" id=\"calcs-section\">\r\n"
				+ "      <div class=\"row\">\r\n" + "	  <h5 class=\"text-center\">\r\n"
				+ "        Numero al que se le desea calcular el cudradado \r\n" + "      </h5>\r\n"
				+ "	  <div class=\"form-check\">\r\n"
				+ "    <input id=\"print\" class=\"col-xs-12 text-right calcs\" type=\"text\" name=\"num\" size=\"16\" style=\" margin-left: 10px;\">\r\n"
				+ "  </div>\r\n" + "        \r\n" + "		<button type=\"submit\" class=\"btn btn-dark\" style=\"\r\n"
				+ "    margin-left: 10px;\r\n" + "    height: 32px;\r\n" + "    padding-top: 3px;\">Submit</button>\r\n"
				+ "	  </div>\r\n" + "	  \r\n" + "    </div>\r\n" + "	<form>\r\n" + "    </div>\r\n" + "  </div>\r\n"
				+ "	<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n"
				+ "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n"
				+ "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n"
				+ "  </body>\r\n" + "</html>\r\n" + "</html>");
		get("/resp", (req, res) -> "<!DOCTYPE html>\r\n" + "<html>\r\n" + "   <head>\r\n"
				+ "    <!-- Required meta tags -->\r\n" + "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n"
				+ "\r\n" + "    <!-- Bootstrap CSS -->\r\n"
				+ "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n"
				+ "\r\n" + "    <title>Caculadora</title>\r\n" + "  </head>\r\n"
				+ "  <body style='background-color:#dc3545;'>\r\n" + " <div class=\"container\">\r\n"
				+ "	<h2>Respuesta</h2>\r\n" + "	<form action=\"index\">\r\n" + "		<h4>\r\n" + "			Cuadrado: "
				+ MathServices.square(req.queryParams("num")) + "		\r\n" + "		</h4>\r\n" + "		\r\n"
				+ "		<button type=\"submit\" class=\"btn btn-dark\">Volver</button>\r\n" + "	  </div>\r\n"
				+ "	\r\n" + "	</form>\r\n" + "    \r\n" + "  </div>\r\n"
				+ "	<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n"
				+ "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n"
				+ "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n"
				+ "  </body>\r\n" + "</html>");
	}


	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567; // returns default port if heroku-port isn't set (i.e. on localhost)
	}
}
