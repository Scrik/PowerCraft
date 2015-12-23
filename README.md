# PowerCraft
- This [Minecraft Forge](http://minecraftforge.net) mod adds power to minecraft. 
- Travis: [![Build Status](https://travis-ci.org/supertassu/PowerCraft.svg?branch=master)](https://travis-ci.org/supertassu/PowerCraft)
- Get good idea for the mod? Then, open issue with label ```feature-request``` or code it yourself and open a PR. **Note!** Check setup.

## Setup
### For player
* Install latest Minecraft Forge for minecraft ```1.7.10```.
* Download latest ```PowerCraft-latest.jar``` from [here](https://github.com/supertassu/PowerCraft/releases).
* Put ```PowerCraft-latest.jar``` into ```MINECRAFT_DIR/mods/``` folder.
* Start minecraft using Forge profile.
* Be fun.

### For modder
**Note!** Commands are for *nix operating systems.
- Clone this repo to empty directory.<br>
```
$ git clone https://github.com/supertassu/PowerCraft.git
$ cd PowerCraft
```
- Update classpath.<br>
```
$ ./gradlew setuDecompWorkspace
$ ./gradlew eclipse
```
- Open eclipse for your default workspace.
- Import project's root directory to your workspace.
- Test building the project.<br>
```
$ ./gradlew build
```
- If build faiils and the following badge says ```build passing``` something is wrong.
  - [![Build Status](https://travis-ci.org/supertassu/PowerCraft.svg?branch=master)](https://travis-ci.org/supertassu/PowerCraft)
- Code.
- Open a Pull Request.
