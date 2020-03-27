package gl51.service.lmpl

import gl51.data.photo
import gl51.service.DBupdate
import gl51.service.fetch

import javax.inject.Inject

class UpdateDBImpl implements DBupdate{

    @Inject FetchService fetchService
    boolean dbupdate() {
        photo picture = fetchService.fetch()
        def name = photo.name
        def path = photo.path
		def legend = photo.legend
        return true

    }

}
