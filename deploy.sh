#!/bin/zsh
DATE="$(date +%Y%m%d.%H%M%S)"
ARCHIVE="mikeihbe.com.tar.gz"
#tar --dereference -czvf $ARCHIVE controllers deps src static views classes bin start
ssh root@linode "cd /www/mikeihbe.com; mkdir -vp $DATE"
scp $ARCHIVE root@linode:/www/mikeihbe.com/$DATE/
ssh root@linode "cd /www/mikeihbe.com/$DATE; tar -xzvf $ARCHIVE"
