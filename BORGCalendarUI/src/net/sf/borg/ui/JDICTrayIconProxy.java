/*
 * This file is part of BORG.
 * 
 * BORG is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * BORG is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * BORG; if not, write to the Free Software Foundation, Inc., 59 Temple Place,
 * Suite 330, Boston, MA 02111-1307 USA
 * 
 * Copyright 2005 by ==Quiet==
 */
package net.sf.borg.ui;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import net.sf.borg.common.util.Resource;
import net.sf.borg.common.util.Version;

import org.jdesktop.jdic.tray.SystemTray;
import org.jdesktop.jdic.tray.TrayIcon;




public class JDICTrayIconProxy {
	   static
	    {
	        Version
	                .addVersion("$Id$");
	    }
	static private JDICTrayIconProxy singleton = null;
	static public JDICTrayIconProxy getReference()
	{
		if( singleton == null )
			singleton = new JDICTrayIconProxy();
		return( singleton );
	}
	private TrayIcon TIcon = null;
    
    public void init(String trayname)
    {
        if (TIcon == null)
        {

            Image image = Toolkit.getDefaultToolkit().getImage(
                    getClass().getResource("/resource/borg16.jpg"));
            
			TIcon = new TrayIcon(new ImageIcon(image));
			
            TIcon.setToolTip(trayname);
            JPopupMenu popup = new JPopupMenu();
            JMenuItem item = new JMenuItem(
                    Resource.getResourceString("Open_Calendar"));
            //item.setDefault(true);
            item.addActionListener(new OpenListener());
            popup.add(item);
            item = new JMenuItem(Resource
                    .getResourceString("Open_Task_List"));
            item.addActionListener(new TaskListener());
            popup.add(item);
            item = new JMenuItem(Resource
                    .getResourceString("Open_Address_Book"));
            item.addActionListener(new AddrListener());
            popup.add(item);
            item = new JMenuItem(Resource
                    .getResourceString("To_Do_List"));
            item.addActionListener(new TodoListener());
            popup.add(item);
            item = new JMenuItem(Resource
                    .getResourceString("Options"));
            item.addActionListener(new OptionsListener());
            popup.add(item);
            item = new JMenuItem(Resource
                    .getResourceString("Exit"));
            item.addActionListener(new ExitListener());
            popup.add(item);
            
            TIcon.setPopupMenu(popup);
            TIcon.addActionListener(new OpenListener());
            
            SystemTray tray = SystemTray.getDefaultSystemTray();
            tray.addTrayIcon(TIcon);
        }
    }
    
    // Called when exit option in systray menu is chosen
    static private class ExitListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //WindowsTrayIcon.cleanUp();
            System.exit(0);
        }
    }

    // Called when open option is systray menu is chosen
    private class OpenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            CalendarView cg = CalendarView.getReference(true);
            cg.toFront();
        }
    }

    static private class TaskListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            TaskListView bt_ = TaskListView.getReference();
            bt_.refresh();
            bt_.show();
        }
    }

    static private class AddrListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            AddrListView ab = AddrListView.getReference();
            ab.refresh();
            ab.show();
        }
    }

    static private class TodoListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            TodoView.getReference().show();
        }
    }
    
    static private class OptionsListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            OptionsView.getReference().show();
        }
    }

 
}