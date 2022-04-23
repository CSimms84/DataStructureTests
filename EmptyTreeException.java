//**************************************************************************************************
// CLASS: EmptyTreeException
//
// AUTHOR
// Charlie Simms
// Date
// April 23, 2022
//**************************************************************************************************
import java.io.Serializable;

/**
 * EmptyTreeException is thrown by certain BinaryTree methods which are invoked on an empty tree.
 */
public class EmptyTreeException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;
}
