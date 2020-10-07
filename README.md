# accesscheck
Anonymous login example on CUBA Platform

# Purpose
This very short example shows how to manage anonymous access to Cuba apps.
I've chosen - as a use case to implement - to let people be able to enter my app (which basically makes almost nothing ;-) ) and to access to a limited number of menu items.
On top of this code you'll need to proceed to some basic settings in the app before it works well.

1. launch the app an sign with the admin/admin account
2. move to the Adminstration > Roles menu and create a new role: anonymous
3. set the permissions for this role. For instance I selected: *Screen* > *Main menu* and set *Allow* for Application, Bs and Cs. You can even consider to set Write access to the entities A, B or C or to give rights (***Specific*** > *Specific Permissions - CUBA _ Generic UI - Filter - Create/modify filters* : *Allow*) if you want.

That's it. If you want to reproduce that on your own project, don't forget to check the file **modules\web\src\com\company\*your_project*\web-app.properties**. It must contain the line
`cuba.web.allowAnonymousAccess = true`
