package moviescraper.doctord.controller;

import java.awt.event.ActionEvent;

import moviescraper.doctord.view.GUIMain;
/**
 * Deprecated - As of v0.2.00-alpha use ScrapeAmalgamationAction instead
 */
@Deprecated
public class ScrapeMovieActionAutomatic extends ScrapeMovieAction
{
	private static final long serialVersionUID = 1L;

	public ScrapeMovieActionAutomatic(GUIMain guiMain)
	{
		super(guiMain);
		putValue(NAME, "Scrape JAV (Automatic)");
		putValue(SHORT_DESCRIPTION, "Scrape Selected Movie (Automatic)");
		promptUserForURLWhenScraping = false;
		manuallyPickFanart = false;
	}
	@Override
	public void actionPerformed(ActionEvent e){
		super.actionPerformed(e);
	}
}