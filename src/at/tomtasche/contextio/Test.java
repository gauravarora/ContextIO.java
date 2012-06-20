package at.tomtasche.contextio;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Thomas Taschauer | tomtasche.at
 * 
 */
public class Test {

	public static void main(String[] args) {
		ContextIO dokdok = new ContextIO("90l8yq6q", "FNGO7HAW63onuiEs");

		Map<String, String> params = new HashMap<String, String>();
		params.put("since", "0");

		System.out
				.println(dokdok.allMessages("gauravsworld@gmail.com", params).rawResponse
						.getBody());
	}
}
