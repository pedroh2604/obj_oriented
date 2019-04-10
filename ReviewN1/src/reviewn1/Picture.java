/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewn1;

/**
 *
 * @author lab801
 */
public class Picture {
    private String src;
    private Size size;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Picture(String src, Size size) {
        this.src = src;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Picture{" + "src=" + src + ", size=" + size + '}';
    }

    
    
    
}
