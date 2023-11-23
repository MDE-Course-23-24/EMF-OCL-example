package it.univaq.disim.mde2324.library.ui.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import Juri.Library;
import it.univaq.disim.mde2324.serializer.Util;

public class LoadHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		JuriSaveDialog dialog = new JuriSaveDialog(window.getShell());
		dialog.create();
		String value = "DEFAILT.xmi";
		if (dialog.open() == Window.OK) {
			try {
				System.out.println(dialog.getFullname());
				Library l = Util.load(dialog.getFullname());
				l.getBooks().forEach(z -> System.out.println(z));
			} catch (Exception e) {
				ErrorDialog dialogo = new ErrorDialog(window.getShell(), "ERRORE", e.getMessage(),
						getMultiStatus(e.getMessage(), e), IStatus.ERROR);
				dialogo.open();
			}
		}

		return null;
	}
	
	private static MultiStatus getMultiStatus(String msg, Throwable t) {

		  List<Status> statuses = new ArrayList<Status>();
		  StackTraceElement[] stackTraces = t.getStackTrace();

		  for (StackTraceElement stackTrace : stackTraces) {
		   Status status = new Status(IStatus.ERROR, LoadHandler.class.getName(), stackTrace.toString());
		   statuses.add(status);
		  }

		  MultiStatus ms = new MultiStatus(LoadHandler.class.getName(), IStatus.ERROR, statuses.toArray(new Status[] {}),
		    t.toString(), t);
		  return ms;
		 }
}
