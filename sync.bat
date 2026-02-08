set BRANCH=master
git pull --no-rebase origin master

git add -A
git commit -m "Auto-sync: Windows"

git rebase --abort
git merge --abort

git add -A
git commit -m "Auto-sync: Windows"

git push origin master
