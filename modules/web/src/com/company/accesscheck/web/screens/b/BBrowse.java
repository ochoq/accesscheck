package com.company.accesscheck.web.screens.b;

import com.haulmont.cuba.gui.screen.*;
import com.company.accesscheck.entity.B;

@UiController("accesscheck_B.browse")
@UiDescriptor("b-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class BBrowse extends MasterDetailScreen<B> {
}