hibernet Configration if not using maven 
=========================================
Steps to Add JVM Arguments in Eclipse
Here’s how to add the JVM argument in Eclipse to apply it to your project:

Open Run Configurations:

Right-click on your project in the Project Explorer.
Go to Run As and select Run Configurations....
Select Your Java Application:

In the Run Configurations dialog, find your Java application under Java Application on the left side.
Click on it to select it.
Go to Arguments Tab:

With your Java application selected, click on the Arguments tab in the right panel.
Add the VM Argument:

In the VM arguments section, add the following line:
csharp
Copy code

--add-opens java.base/java.lang=ALL-UNNAMED
================================================
Ensure it’s entered correctly without any extra spaces.
Apply Changes:

Click Apply to save the changes.
Run Your Application:

Now you can run your application by clicking the Run button.
