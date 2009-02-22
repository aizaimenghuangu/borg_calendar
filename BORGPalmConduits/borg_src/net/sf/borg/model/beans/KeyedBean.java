/*
This file is part of BORG.
 
    BORG is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.
 
    BORG is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
 
    You should have received a copy of the GNU General Public License
    along with BORG; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 
Copyright 2003 by Mike Berger
 */
/*
 * KeyedBean.java
 *
 * Created on January 1, 2004, 2:43 PM
 */

package net.sf.borg.model.beans;

import java.io.Serializable;

/**
 *
 * @author  mbb
 */
public abstract class KeyedBean implements Serializable
{
    private int key_;
        
    /** Creates a new instance of KeyedBean */
    public KeyedBean()
    {
        key_ = -1;
    }
    
    public int getKey()
    {
        return(key_);
    }
    
    public void setKey(int k)
    {
        key_ = k;
    }
    
    
    protected Object clone(){
        System.out.println("Should not be here!!");
        return( null );
    };
    
}