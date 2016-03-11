# CourtCounterCopy
For playing around with android studio and git.

## Importing to Android Studio from GitHub

For this part, I recommend NOT using the import tools from within Android Studio. Doing that gave me all sorts of unexpected errors. Instead, try following these steps:

1. Using GitHub Desktop, click on the + button at the top left and select "Clone". 
2. Navigate through the menus to select the project you wish to download. (In this case, cs146group4/CourtCounterCopy)
3. Select the directory you want to save your project in. The AndroidStudioProjects folder is a good choice that is automatically created upon installation of Android Studio. On windows, you can find it under C://Users/<username>/AndroidStudioProjects. But you can use whatever folder you want; the default GitHub folder will work too. 
4. Once the repo is cloned on your computer, navigate to the folder you put it under, and verify that the files have appeared.
5. Open up Android Studio. Do not select "Check out project from Version Control". Instead, select "Open an existing Android Studio project". Navigate to your local project directory and open the project.
6. Once the project launches, go to VCS > Enable Version Control Integration. In the menu that appears, select "Git". From this point forward, GitHub desktop will likely be unnecessary. All essential options can now be controlled from within Android Studio's VCS menu.
7. Test out a change. For example, go to app/java/com.example.android.courtcounter/MainActivity. Add some javadoc or some comments, or create a method. Then perform two operations using the VCS menu:
  * __Commit:__ this will save the changes locally on your personal repository. This should not affect the main GitHub repo.
    * Apply a useful message along with your commit, describing what you have changed. For example: "Added Javadoc to addThreeTeamA method"
  * __Push:__ This uploads all changes that you have made to the online GitHub repo. Verify that the repository has been modified online after pushing.
  * __Commit and Push:__ This option shows up in the commit menu. This allows you to do both steps at once. Most of the time this will probably be what you want.
    * However, there may be times where you wish to save your changes locally, but not push your changes yet. In this case, use Commit and Push separately.

* Work in progress. Will add information on ideas of what to modify from within Android Studio.


