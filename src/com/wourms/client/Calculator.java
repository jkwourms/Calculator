package com.wourms.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.button.ButtonGroup;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.form.TextField;

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
		TextField field = new TextField();
		container.add(field);
		container.add(numberPad());

		// Center in screen
		container.setPosition(RootPanel.get().getOffsetWidth() / 2, 100);

		RootPanel.get().add(container);
	}

	private ButtonGroup numberPad() {
		ButtonGroup group = new ButtonGroup();

		FlexTable table = new FlexTable();
		group.add(table);

		int row = 0;
		int col = 0;
		for (int i = 1; i < 10; i++) {
			String value = String.valueOf(i);
			TextButton btn = new TextButton(value);
			btn.getElement().setId("numberPadButton");
			table.setWidget(row, col, btn);
			col++;
			if (i % 3 == 0) {
				row++;
				col = 0;
			}
		}

		return group;
	}
}
