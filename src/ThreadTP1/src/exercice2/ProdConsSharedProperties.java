/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread2;

/**
 *
 * @author pierre-fredericvillard
 */
public class ProdConsSharedProperties {
    protected Pile _stack;
    protected long _delay;
    protected String _name;
    public static int _MAX=10;

    public ProdConsSharedProperties(String name, Pile stack, long delay)
    {
        _stack=stack;
        _delay=delay;
        _name=name;
    }

}
