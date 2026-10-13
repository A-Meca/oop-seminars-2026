# Help with Git and GitHub

Stuck with Git? Start with the course setup pages, then use the tutorials below to go further.

## Start here

**[Course setup pages: Java, Eclipse, Git](https://evisp.github.io/java-oop-course/00-tools/)**
The same steps we followed in the seminar, with a troubleshooting section for the errors you are most likely to see. Read the message, find it on the page, then ask.

## Tutorials

**[GitHub Hello World](https://docs.github.com/en/get-started/using-github/hello-world)** · official GitHub guide · about 15 minutes
A tour of GitHub done entirely in the browser, with nothing to install. A good way to get comfortable with the website. If you follow it:
- Do it in a **new practice repository** called `hello-world`, as the guide says, **not** in your course repository (`java-oop-surname`). You can delete the practice repository afterwards: Settings → scroll to the bottom → Delete this repository.
- Do not edit the files of your course repository on the GitHub website. Your computer will not have those changes, so your next `git push` gets rejected. If it happens: `git pull --rebase origin main`, then `git push`.
- Branches and pull requests are not needed until the sprints, so treat that part as a preview.

**[An Intro to Git and GitHub for Beginners](https://product.hubspot.com/blog/git-and-github-tutorial-for-beginners)** · written tutorial
The same commands we use in the seminar, explained step by step. It was written in 2020, so two things have changed since:
- Where it says Git will ask for your username and password: GitHub no longer accepts your password there. A browser window opens and you sign in, exactly as in the seminar.
- Wherever it says `master`, write `main`.

If a command for creating a file does not work in PowerShell, create the file with Notepad instead. The parts on branches and pull requests are optional for now.

**[How to push an Eclipse project to GitHub](https://www.youtube.com/watch?v=B2N1AKIQfnY)** · video · 7 minutes
The same job done with Eclipse's menus instead of PowerShell (Team → Share Project → Commit → Push). Both ways work. Pick one and stick with it in the same project. If you follow the video:
- Create your `.gitignore` **before** the first commit, as in the seminar. The video skips this, and without it `bin/` and Eclipse's settings files end up on GitHub.
- When you create the repository on GitHub, do **not** tick "Add a README".
- When Eclipse asks for a password, it needs a **personal access token**, not your GitHub password. To create one: on GitHub, click your profile picture → Settings → Developer settings → Personal access tokens → Tokens (classic) → Generate new token. Tick `repo`, generate it, and copy it straight away, because GitHub shows it only once. Treat it like a password.

## On a lab computer

Lab computers are shared, so two things to check:
- **Before you commit:** run `git config user.name`. If it shows someone else's name, set your own with `git config --global user.name "Your Name"` (and the same for `user.email`).
- **When you leave:** remove your GitHub sign-in, or the next person can push to your repository. Control Panel → Credential Manager → Windows Credentials → `git:https://github.com` → Remove.
