package com.company.accesscheck.web.screens.c;

import com.haulmont.cuba.gui.screen.*;
import com.company.accesscheck.entity.C;

@UiController("accesscheck_C.browse")
@UiDescriptor("c-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CBrowse extends MasterDetailScreen<C> {
}