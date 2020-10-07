package com.company.accesscheck.web.screens.a;

import com.haulmont.cuba.gui.screen.*;
import com.company.accesscheck.entity.A;

@UiController("accesscheck_A.browse")
@UiDescriptor("a-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ABrowse extends MasterDetailScreen<A> {
}