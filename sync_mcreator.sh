#!/bin/bash

BRANCH="master"

echo "🚀 Starting fresh sync..."

# 1. Clean up any stuck Git states (rebases/merges)
git rebase --abort 2>/dev/null
git merge --abort 2>/dev/null

# 2. Ensure we are actually on master
git checkout $BRANCH

# 3. Stage and commit local changes
git add -A
if git diff-index --quiet HEAD --; then
    echo "idle: No local changes to commit."
else
    git commit -m "Auto-sync: $(date +'%Y-%m-%d %H:%M:%S')"
fi

# 4. Sync with the server
# Use --rebase to keep the history clean, but keep OUR changes on top
echo "📥 Fetching and merging updates..."
git pull origin $BRANCH --rebase -X ours

# 5. Push
echo "📤 Pushing to GitHub..."
git push origin $BRANCH

echo "✨ Sync complete! You are now perfectly aligned with the repo."
