set -ex
git fetch
docker run --rm -v "$PWD":/app treeder/bump patch
version=`cat VERSION`
echo "version: $version"

git add -A
git commit -m "Release version $version"
git tag -a "$version" -m "version $version"
git push --tags