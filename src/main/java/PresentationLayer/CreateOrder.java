package PresentationLayer;

import FunctionLayer.LoginSampleException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Johachim
 */
public class CreateOrder extends Command {

String execute(HttpServletRequest request, HttpServletResponse response) {
        return "order";
    }
    
}
