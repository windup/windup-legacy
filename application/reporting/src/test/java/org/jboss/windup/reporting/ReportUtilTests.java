package org.jboss.windup.reporting;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class ReportUtilTests {
    
    private static final String TMP_PATH = "C:\\Users\\Foo\\Desktop\\temp\\";
    
	@Test
	public void testCalculateRelativePathToRoot_Simple() {
		String relativePathToRoot = ReportUtil.calculateRelativePathToRoot(
				new File(TMP_PATH + "WAS-EAR-doc\\"),
				new File(TMP_PATH + "WAS-EAR-doc\\WAS-EAR\\.settings\\org.eclipse.wst.common.project.facet.core.xml.html"));
		
		Assert.assertEquals("../../", relativePathToRoot);
	}
	
	@Test
	public void testCalculateRelativePathFromRoot_Simple() {
		String relativePathToRoot = ReportUtil.calculateRelativePathFromRoot(
				new File(TMP_PATH + "WAS-EAR-doc\\"),
				new File(TMP_PATH + "WAS-EAR-doc\\WAS-EAR\\.settings\\org.eclipse.wst.common.project.facet.core.xml.html"));
		
		Assert.assertEquals("WAS-EAR/.settings/org.eclipse.wst.common.project.facet.core.xml.html", relativePathToRoot);
	}
	
	@Test
	public void testCalculateRelativePathToRoot_Elipses0() {
		String relativePathToRoot = ReportUtil.calculateRelativePathToRoot(
				new File(TMP_PATH + "windup-cli-0.7.0\\..\\WAS-EAR-doc\\"),
				new File(TMP_PATH + "WAS-EAR-doc\\WAS-EAR\\.settings\\org.eclipse.wst.common.project.facet.core.xml.html"));
		
		Assert.assertEquals("../../", relativePathToRoot);
	}
	
	@Test
	public void testCalculateRelativePathFromRoot_Elipses0() {
		String relativePathToRoot = ReportUtil.calculateRelativePathFromRoot(
				new File(TMP_PATH + "windup-cli-0.7.0\\..\\WAS-EAR-doc\\"),
				new File(TMP_PATH + "WAS-EAR-doc\\WAS-EAR\\.settings\\org.eclipse.wst.common.project.facet.core.xml.html"));
		
		Assert.assertEquals("WAS-EAR/.settings/org.eclipse.wst.common.project.facet.core.xml.html", relativePathToRoot);
	}
}