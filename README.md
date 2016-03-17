# CourtCounterCopy
## What should I do with this project?
This is a project just to get our feet wet with Git and Android Studio. First, follow the instructions under __Importing to Android Studio from GitHub__ to set up Android Studio with this repository. Then, go wild! Change some code, try to figure out how everything works.

This project is meant to be broken, so don't be shy. Experiment and try out things. It doesn't matter if everything breaks. You can always try to fix it, or, if things get really rough, revert to an older version.

I'll be gradually updating this readme with more information about Android Studio and how it works. I'll give some ideas later for what kind of things you can try.

For now, you can take a look at the tutorial links below to familiarize yourself with how things work.

### Software Downloads:
##### Android Studio:
http://developer.android.com/sdk/index.html
##### GitHub Desktop:
https://desktop.github.com/

### Useful Tutorials
##### GitHub Tutorial
https://guides.github.com/activities/hello-world/
##### Android Studio Tutorials
http://developer.android.com/training/basics/firstapp/index.html

### Importing to Android Studio from GitHub

For this part, I recommend _NOT_ using the import tools from within Android Studio. Doing that gave me all sorts of unexpected errors. If you want to use GitHub Desktop to set up your project, follow these steps:

1. Using GitHub Desktop, click on the + button at the top left and select __"Clone".__ This will allow you to download from any GitHub repo. Select the project you wish to download. (In this case, cs146group4/CourtCounterCopy)
2. Choose the directory you want to save your project in. You can choose AndroidStudioProjects, GitHub, or whatever folder you want. Verify that the files have appeared.
3. Open up Android Studio. Do not select "Check out project from Version Control". Instead, select __"Open an existing Android Studio project".__ Navigate to your local project directory and open the project.
4. Once the project launches, go to __VCS > Enable Version Control Integration.__ In the menu that appears, select __"Git"__. From this point forward, GitHub desktop will likely be unnecessary. All essential operations can now be controlled from within Android Studio's VCS menu.
5. Test out a change. For example, go to app/java/com.example.android.courtcounter/MainActivity. Add some javadoc or some comments, or create a method. Then perform two operations using the VCS menu:
  * __Commit:__ this will save the changes locally on your personal repository. This should not affect the main GitHub repo.
    * Apply a useful message along with your commit, describing what you have changed. For example: "Added Javadoc to addThreeTeamA method"
  * __Push:__ This uploads all changes that you have made to the online GitHub repo. Verify that the repository has been modified online after pushing.
  * __Commit and Push:__ This option shows up in the commit menu. This allows you to do both steps at once. Most of the time this will probably be what you want.
    * However, there may be times where you wish to save your changes locally, but not push your changes yet. In this case, use Commit and Push separately.

_TODO: Add more information about Android Studio_
