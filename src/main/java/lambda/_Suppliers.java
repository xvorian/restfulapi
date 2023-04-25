package lambda;

import java.util.function.Supplier;

public class _Suppliers {

	static Supplier<DBDetails> dbDetails = () -> (new DBDetails("http://localhost", "admin", "adminP"));

	public static void main(String[] args) {
		System.out.println(dbDetails.get());

	}

	static class DBDetails {
		private String dbURL;
		private String username;
		private String userpass;

		public DBDetails(String dbURL, String username, String userpass) {
			super();
			this.dbURL = dbURL;
			this.username = username;
			this.userpass = userpass;
		}

		@Override
		public String toString() {
			return "DBDetails [dbURL=" + dbURL + ", username=" + username + ", userpass=" + userpass + "]";
		}
	}

}
