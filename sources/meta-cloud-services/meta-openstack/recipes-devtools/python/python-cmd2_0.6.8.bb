DESCRIPTION = "Extra features for standard library's cmd module"
HOMEPAGE = "http://packages.python.org/cmd2/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;beginline=21;endline=21;md5=a00047b7e92e0781452d0beba4e7b44e"

SRCNAME = "cmd2"

SRC_URI = "http://pypi.python.org/packages/source/c/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "c32c9a897e010c977b50c1ddc13f09fe"
SRC_URI[sha256sum] = "ac780d8c31fc107bf6b4edcbcea711de4ff776d59d89bb167f8819d2d83764a8"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools 

RDEPENDS_${PN} += "python-pyparsing"
