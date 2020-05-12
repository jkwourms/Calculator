package com.wourms.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.button.ButtonGroup;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Calculator implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network " + "connection and try again.";

	@Override
	public void onModuleLoad() {
		VerticalLayoutContainer container = new VerticalLayoutContainer();
		
		container.add(numberPad());
		
		RootPanel.get().add(container);
	}

	private ButtonGroup numberPad() {
		ButtonGroup group = new ButtonGroup();
		group.setHeading("ButtonGroup");
		
		FlexTable table = new FlexTable();
		group.add(table);
		
		TextButton btn = new TextButton("1");
		table.setWidget(0, 0, btn);
		btn = new TextButton("2");
		table.setWidget(0, 1, btn);
		btn = new TextButton("3");
		table.setWidget(0, 2, btn);
		btn = new TextButton("4");
		table.setWidget(1, 0, btn);
		btn = new TextButton("5");
		table.setWidget(1, 1, btn);
		btn = new TextButton("6");
		table.setWidget(1, 2, btn);
		btn = new TextButton("7");
		table.setWidget(2, 0, btn);
		btn = new TextButton("8");
		table.setWidget(2, 1, btn);
		btn = new TextButton("9");
		table.setWidget(2, 2, btn);
		
		return group;
	}
}
