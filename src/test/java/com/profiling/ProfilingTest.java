package com.profiling;

import com.profiling.ProfilingPage;
import com.searchmodule.pages.SearchPage;
import com.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author: Shaowen Xiang
 * Date: 2020-02-21
 * Test case description:
 */
public class ProfilingTest extends BaseTest {


    @Test
    public void profiling(){
        ProfilingPage profilingPage = new ProfilingPage(driver);
        profilingPage.goTo();
        profilingPage.populateFieldRandomWait();
    }
}
