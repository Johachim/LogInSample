package FunctionLayer;

/**
 *
 * @author Johachim
 */
public class Calculator extends LegoServlet {

        String brickParam = request.getParameter("amountH");
        String brickParam1 = request.getParameter("amountL");
        String brickParam2 = request.getParameter("amoutnW");
        int smallbrick = 1;
        int mediumbrick = 2;
        int bigbrick = 4;
        int sbcounter;
        int mbcounter;
        int bbcounter;
        Integer.valueOf(brickParam)%4%2
    
}
