
class LocIndexer(object):
    
    def __init__(self, dataobj):
        self._dataobj = dataobj
        
    def __getitem__(self, key):
        return self._dataobj._getitem_loc(key)
        
class ILocIndexer(object):
    
    def __init__(self, dataobj):
        self._dataobj = dataobj
        
    def __getitem__(self, key):
        return self._dataobj._getitem_iloc(key)
        
class AtIndexer(object):
    
    def __init__(self, dataobj):
        self._dataobj = dataobj
        
    def __getitem__(self, key):
        return self._dataobj._getitem_at(key)
        
class IAtIndexer(object):
    
    def __init__(self, dataobj):
        self._dataobj = dataobj
        
    def __getitem__(self, key):
        return self._dataobj._getitem_iat(key)